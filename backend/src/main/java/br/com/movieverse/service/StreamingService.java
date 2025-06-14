package br.com.movieverse.service;

import br.com.movieverse.repository.StreamingRepository;
import org.springframework.stereotype.Service;

@Service
public class StreamingService {

    private final StreamingRepository streamingRepository;

    public StreamingService(StreamingRepository streamingRepository) {
        this.streamingRepository = streamingRepository;
    }

    
}
