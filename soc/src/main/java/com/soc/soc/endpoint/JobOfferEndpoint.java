package com.soc.soc.endpoint;


import com.soc.soc.model.JobOffer;
import com.soc.soc.service.JobOfferService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class JobOfferEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/jobportal";

    private final JobOfferService jobOfferService;

    public JobOfferEndpoint(JobOfferService jobOfferService) {
        this.jobOfferService = jobOfferService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetJobOfferRequest")
    @ResponsePayload
    public GetJobOfferResponse getJobOffer(@RequestPayload GetJobOfferRequest request) {
        JobOffer jobOffer = jobOfferService.getJobOfferById(request.getId());
        GetJobOfferResponse response = new GetJobOfferResponse();
        response.setJobOffer(jobOffer);
        return response;
    }
}
