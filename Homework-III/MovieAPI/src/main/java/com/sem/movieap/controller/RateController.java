package com.sem.movieap.controller;

import com.sem.movieap.controller.request.RateRequest;
import com.sem.movieap.controller.response.RateResponse;
import com.sem.movieap.service.Rate;
import com.sem.movieap.service.RateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class RateController {

    private final RateService rateService;

    @PostMapping("/rates")
    public void rate(@RequestBody @Valid RateRequest rateRequest) {
        Rate rate = rateRequest.convertToRate();
        rateService.create(rate);
    }

    @GetMapping("/rates")
    public List<RateResponse> retrieveByMovieId(@RequestParam Long movieId) {
        List<Rate> rateList = rateService.retrieve(movieId);
        return RateResponse.convertFromRate(rateList);
    }
}
