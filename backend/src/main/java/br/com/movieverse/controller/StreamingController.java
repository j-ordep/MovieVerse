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
import java.util.Optional;

@RestController
@RequestMapping("/movieflix/streaming")
public class StreamingController {

    private final StreamingService streamingService;

    public StreamingController(StreamingService streamingService) {
        this.streamingService = streamingService;
    }

    @PostMapping
    public ResponseEntity<StreamingResponse> saveStreaming(@RequestBody StreamingRequest request) {
        Streaming newStreaming = StreamingMapper.toStreaming(request);
        Streaming savedStreaming = streamingService.save(newStreaming);
        StreamingResponse response = StreamingMapper.toResponse(savedStreaming);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<StreamingResponse>> getAllStreamings(){
        List<StreamingResponse> listStreaming = streamingService.getAll()
                .stream()
                .map(streaming -> StreamingMapper.toResponse(streaming))
                .toList();

        return ResponseEntity.ok(listStreaming);
    }

    @GetMapping("{id}")
    public ResponseEntity<StreamingResponse> getStreamingById(@PathVariable Long id) {
        return streamingService.getById(id)
                .map(streaming -> ResponseEntity.ok(StreamingMapper.toResponse(streaming)))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStreaming(@PathVariable Long id) {
        streamingService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
