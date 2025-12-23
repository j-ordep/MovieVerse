package br.com.movieverse.service;

import br.com.movieverse.entity.Streaming;
import br.com.movieverse.repository.StreamingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StreamingService {

    private final StreamingRepository streamingRepository;

    public StreamingService(StreamingRepository streamingRepository) {
        this.streamingRepository = streamingRepository;
    }

    public Streaming save(Streaming streaming) {
        return streamingRepository.save(streaming);
    }

    public List<Streaming> getAll() {
        List<Streaming> streamings = streamingRepository.findAll();
        return streamings;
    }

    public Optional<Streaming> getById(Long id) {
        return streamingRepository.findById(id);
    }

    public void deleteById(Long id) {
        streamingRepository.deleteById(id);
    }
}
