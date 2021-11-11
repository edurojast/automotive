/*
 * Swagger Car automotive
 * Sample for an Automotive.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: juanpablo.rivera@globant.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Car;
import java.io.File;
import io.swagger.client.model.ModelApiResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CarApi
 */
@Ignore
public class CarApiTest {

    private final CarApi api = new CarApi();

    
    /**
     * Add a new car to the automotive
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCarTest() throws ApiException {
        Car body = null;
        api.addCar(body);

        // TODO: test validations
    }
    
    /**
     * Deletes a car
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCarTest() throws ApiException {
        Long carId = null;
        String apiKey = null;
        api.deleteCar(carId, apiKey);

        // TODO: test validations
    }
    
    /**
     * Finds Cars by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findCarsByStatusTest() throws ApiException {
        List<String> status = null;
        List<Car> response = api.findCarsByStatus(status);

        // TODO: test validations
    }
    
    /**
     * Finds Cars by tags
     *
     * Muliple tags can be provided with comma separated strings. Use         tag1, tag2, tag3 for testing.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findCarsByTagsTest() throws ApiException {
        List<String> tags = null;
        List<Car> response = api.findCarsByTags(tags);

        // TODO: test validations
    }
    
    /**
     * Find car by ID
     *
     * Returns a single car
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCarByIdTest() throws ApiException {
        Long carId = null;
        Car response = api.getCarById(carId);

        // TODO: test validations
    }
    
    /**
     * Update an existing car
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCarTest() throws ApiException {
        Car body = null;
        api.updateCar(body);

        // TODO: test validations
    }
    
    /**
     * Updates a car in the automotive with form data
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCarWithFormTest() throws ApiException {
        Long carId = null;
        String name = null;
        String status = null;
        api.updateCarWithForm(carId, name, status);

        // TODO: test validations
    }
    
    /**
     * uploads an image
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadFileTest() throws ApiException {
        Long carId = null;
        String additionalMetadata = null;
        File file = null;
        ModelApiResponse response = api.uploadFile(carId, additionalMetadata, file);

        // TODO: test validations
    }
    
}
