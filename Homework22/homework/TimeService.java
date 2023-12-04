package Homework22.homework;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class TimeService {

    @GET
    @Path("/{city}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getTime(@PathParam("city") String city) {
        ZoneId zoneId = getZoneId(city);
        LocalDateTime now = LocalDateTime.now(zoneId);
        return "Current time in " + city + ": " + now.toString();
    }

    private ZoneId getZoneId(String city) {
        switch (city) {
            case "Минск":
                return ZoneId.of("Europe/Minsk");
            case "Вашингтон":
                return ZoneId.of("America/New_York");
            case "Пекин":
                return ZoneId.of("Asia/Shanghai");
            default:
                throw new IllegalArgumentException("Unknown city: " + city);
        }
    }
}
