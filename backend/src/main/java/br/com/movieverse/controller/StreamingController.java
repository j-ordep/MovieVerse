package br.com.movieverse.controller;

import br.com.movieverse.controller.request.StreamingRequest;
import br.com.movieverse.controller.response.StreamingResponse;
import br.com.movieverse.entity.Streaming;
import br.com.movieverse.mapper.StreamingMapper;
import br.com.movieverse.service.StreamingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movieflix/streaming")
public class StreamingController {

    private final StreamingService streamingService;

    public StreamingController(StreamingService streamingService) {
        this.streamingService = streamingService;
    }

    @PostMapping
    public ResponseEntity<StreamingResponse> save(@RequestBody StreamingRequest request) {
        Streaming streaming = StreamingMapper.toStreaming(request);
        streamingService.save(streaming);
        return ResponseEntity.status(HttpStatus.CREATED).body(StreamingMapper.toResponse(streaming));
    }

    @GetMapping
    public List<StreamingResponse> getAll(){
        List<StreamingResponse> listStreaming = streamingService.getAll()
                .stream()
                .map(streaming -> StreamingMapper.toResponse(streaming))
                .toList();
        return listStreaming;
    }

}
