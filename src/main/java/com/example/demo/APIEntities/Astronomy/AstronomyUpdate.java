package com.example.demo.APIEntities.Astronomy;
public class AstronomyUpdate{
    public Location location;
    public Astronomy astronomy;
}

class Astro{
    public String sunrise;
    public String sunset;
    public String moonrise;
    public String moonset;
    public String moon_phase;
    public int moon_illumination;
    public int is_moon_up;
    public int is_sun_up;
}

class Astronomy{
    public Astro astro;
}

class Location{
    public String name;
    public String region;
    public String country;
    public double lat;
    public double lon;
    public String tz_id;
    public int localtime_epoch;
    public String localtime;
}
