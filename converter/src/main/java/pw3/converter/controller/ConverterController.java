package pw3.converter.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pw3.converter.request.KilometerRequest;
import pw3.converter.request.KnotRequest;
import pw3.converter.response.KilometersResponse;
import pw3.converter.response.MilesResponse;


import java.text.DecimalFormat;
import java.util.Map;

@RestController
@RequestMapping("/convert")
public class ConverterController {

    @GetMapping("/test")
    public String testApi(){
        return "Hello!";
    }

    @PostMapping(path = "/miles",
            consumes = { MediaType.APPLICATION_JSON_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE })
    public MilesResponse kilometersToMiles(@RequestBody KilometerRequest kilometer){

        double oneMile = 0.621371;
        double kilometers = kilometer.getKilometer();
        double result = kilometers * oneMile;
        DecimalFormat df = new DecimalFormat("#.00000");
        df.format(result);

        return new MilesResponse(df.format(result));
    }


    @PostMapping("/kilometers")
    public KilometersResponse knotsToKilometers(@RequestBody KnotRequest knot){

        double oneKnot = 1.852;
        double knots = knot.getKnot();
        double result = knots * oneKnot;
        DecimalFormat df = new DecimalFormat("#.000");
        df.format(result);

        return new KilometersResponse(df.format(result));
    }
}
