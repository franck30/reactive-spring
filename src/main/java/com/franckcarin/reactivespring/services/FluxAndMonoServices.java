package com.franckcarin.reactivespring.services;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class FluxAndMonoServices {

  public Flux<String> fruitsFlux() {
    return Flux.fromIterable(List.of("Mango", "Orange", "Banana"));
  }

  public Mono<String> fruitMono() {
    return Mono.just("Mango");
  }

  public static void main(String[] args) {

    FluxAndMonoServices fluxAndMonoServices
            = new FluxAndMonoServices();

    fluxAndMonoServices.fruitsFlux()
            .subscribe(s -> {
              System.out.println("s = " + s);
            });

    fluxAndMonoServices.fruitMono()
            .subscribe(s -> {
              System.out.println("Mono -> s" + s);
            });
  }

}
