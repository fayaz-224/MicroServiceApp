package com.embarkx.jobms.job.clients;

import com.embarkx.jobms.job.externalDto.Company;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//Feign is a declarative web service client designed to make HTTP clients easier
//Mostly used to avoid boilerplate code of restTemplate
@FeignClient(name = "COMPANY-SERVICE")
public interface CompanyClient {

    @GetMapping("/companies/{id}")
    Company getCompany(@PathVariable("id") Long id);
}
