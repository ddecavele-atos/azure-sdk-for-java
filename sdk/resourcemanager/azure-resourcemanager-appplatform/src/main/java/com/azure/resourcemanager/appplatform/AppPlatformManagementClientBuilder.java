// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;

/** A builder for creating a new instance of the AppPlatformManagementClient type. */
@ServiceClientBuilder(serviceClients = {AppPlatformManagementClient.class})
public final class AppPlatformManagementClientBuilder {
    /*
     * Gets subscription ID which uniquely identify the Microsoft Azure
     * subscription. The subscription ID forms part of the URI for every
     * service call.
     */
    private String subscriptionId;

    /**
     * Sets Gets subscription ID which uniquely identify the Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the AppPlatformManagementClientBuilder.
     */
    public AppPlatformManagementClientBuilder subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /*
     * server parameter
     */
    private String endpoint;

    /**
     * Sets server parameter.
     *
     * @param endpoint the endpoint value.
     * @return the AppPlatformManagementClientBuilder.
     */
    public AppPlatformManagementClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * The environment to connect to
     */
    private AzureEnvironment environment;

    /**
     * Sets The environment to connect to.
     *
     * @param environment the environment value.
     * @return the AppPlatformManagementClientBuilder.
     */
    public AppPlatformManagementClientBuilder environment(AzureEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the AppPlatformManagementClientBuilder.
     */
    public AppPlatformManagementClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of AppPlatformManagementClient with the provided parameters.
     *
     * @return an instance of AppPlatformManagementClient.
     */
    public AppPlatformManagementClient buildClient() {
        if (endpoint == null) {
            this.endpoint = "https://management.azure.com";
        }
        if (environment == null) {
            this.environment = AzureEnvironment.AZURE;
        }
        if (pipeline == null) {
            this.pipeline =
                new HttpPipelineBuilder()
                    .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                    .build();
        }
        AppPlatformManagementClient client =
            new AppPlatformManagementClient(pipeline, environment, subscriptionId, endpoint);
        return client;
    }
}