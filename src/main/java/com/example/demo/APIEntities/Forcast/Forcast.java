package com.example.demo.APIEntities.Forcast;

import java.util.ArrayList;

public class Forcast{
    public Location location;
    public Current current;
    public Forecast forecast;
    
	public Forcast(Location location, Current current, Forecast forecast) {
		super();
		this.location = location;
		this.current = current;
		this.forecast = forecast;
	}
	public Forcast() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Current getCurrent() {
		return current;
	}
	public void setCurrent(Current current) {
		this.current = current;
	}
	public Forecast getForecast() {
		return forecast;
	}
	public void setForecast(Forecast forecast) {
		this.forecast = forecast;
	}


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
	public Astro(String sunrise, String sunset, String moonrise, String moonset, String moon_phase,
			int moon_illumination, int is_moon_up, int is_sun_up) {
		super();
		this.sunrise = sunrise;
		this.sunset = sunset;
		this.moonrise = moonrise;
		this.moonset = moonset;
		this.moon_phase = moon_phase;
		this.moon_illumination = moon_illumination;
		this.is_moon_up = is_moon_up;
		this.is_sun_up = is_sun_up;
	}
	public Astro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSunrise() {
		return sunrise;
	}
	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}
	public String getSunset() {
		return sunset;
	}
	public void setSunset(String sunset) {
		this.sunset = sunset;
	}
	public String getMoonrise() {
		return moonrise;
	}
	public void setMoonrise(String moonrise) {
		this.moonrise = moonrise;
	}
	public String getMoonset() {
		return moonset;
	}
	public void setMoonset(String moonset) {
		this.moonset = moonset;
	}
	public String getMoon_phase() {
		return moon_phase;
	}
	public void setMoon_phase(String moon_phase) {
		this.moon_phase = moon_phase;
	}
	public int getMoon_illumination() {
		return moon_illumination;
	}
	public void setMoon_illumination(int moon_illumination) {
		this.moon_illumination = moon_illumination;
	}
	public int getIs_moon_up() {
		return is_moon_up;
	}
	public void setIs_moon_up(int is_moon_up) {
		this.is_moon_up = is_moon_up;
	}
	public int getIs_sun_up() {
		return is_sun_up;
	}
	public void setIs_sun_up(int is_sun_up) {
		this.is_sun_up = is_sun_up;
	}

}

class Condition{
    public String text;
    public String icon;
    public int code;
	public Condition(String text, String icon, int code) {
		super();
		this.text = text;
		this.icon = icon;
		this.code = code;
	}
	public Condition() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}

}

class Current{
    public int last_updated_epoch;
    public String last_updated;
    public double temp_c;
    public int temp_f;
    public int is_day;
    public Condition condition;
    public double wind_mph;
    public int wind_kph;
    public int wind_degree;
    public String wind_dir;
    public int pressure_mb;
    public double pressure_in;
    public int precip_mm;
    public int precip_in;
    public int humidity;
    public int cloud;
    public double feelslike_c;
    public double feelslike_f;
    public double windchill_c;
    public double windchill_f;
    public double heatindex_c;
    public double heatindex_f;
    public double dewpoint_c;
    public double dewpoint_f;
    public int vis_km;
    public int vis_miles;
    public double uv;
    public double gust_mph;
    public double gust_kph;
	public Current(int last_updated_epoch, String last_updated, double temp_c, int temp_f, int is_day,
			Condition condition, double wind_mph, int wind_kph, int wind_degree, String wind_dir, int pressure_mb,
			double pressure_in, int precip_mm, int precip_in, int humidity, int cloud, double feelslike_c,
			double feelslike_f, double windchill_c, double windchill_f, double heatindex_c, double heatindex_f,
			double dewpoint_c, double dewpoint_f, int vis_km, int vis_miles, double uv, double gust_mph,
			double gust_kph) {
		super();
		this.last_updated_epoch = last_updated_epoch;
		this.last_updated = last_updated;
		this.temp_c = temp_c;
		this.temp_f = temp_f;
		this.is_day = is_day;
		this.condition = condition;
		this.wind_mph = wind_mph;
		this.wind_kph = wind_kph;
		this.wind_degree = wind_degree;
		this.wind_dir = wind_dir;
		this.pressure_mb = pressure_mb;
		this.pressure_in = pressure_in;
		this.precip_mm = precip_mm;
		this.precip_in = precip_in;
		this.humidity = humidity;
		this.cloud = cloud;
		this.feelslike_c = feelslike_c;
		this.feelslike_f = feelslike_f;
		this.windchill_c = windchill_c;
		this.windchill_f = windchill_f;
		this.heatindex_c = heatindex_c;
		this.heatindex_f = heatindex_f;
		this.dewpoint_c = dewpoint_c;
		this.dewpoint_f = dewpoint_f;
		this.vis_km = vis_km;
		this.vis_miles = vis_miles;
		this.uv = uv;
		this.gust_mph = gust_mph;
		this.gust_kph = gust_kph;
	}
	public Current() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLast_updated_epoch() {
		return last_updated_epoch;
	}
	public void setLast_updated_epoch(int last_updated_epoch) {
		this.last_updated_epoch = last_updated_epoch;
	}
	public String getLast_updated() {
		return last_updated;
	}
	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}
	public double getTemp_c() {
		return temp_c;
	}
	public void setTemp_c(double temp_c) {
		this.temp_c = temp_c;
	}
	public int getTemp_f() {
		return temp_f;
	}
	public void setTemp_f(int temp_f) {
		this.temp_f = temp_f;
	}
	public int getIs_day() {
		return is_day;
	}
	public void setIs_day(int is_day) {
		this.is_day = is_day;
	}
	public Condition getCondition() {
		return condition;
	}
	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	public double getWind_mph() {
		return wind_mph;
	}
	public void setWind_mph(double wind_mph) {
		this.wind_mph = wind_mph;
	}
	public int getWind_kph() {
		return wind_kph;
	}
	public void setWind_kph(int wind_kph) {
		this.wind_kph = wind_kph;
	}
	public int getWind_degree() {
		return wind_degree;
	}
	public void setWind_degree(int wind_degree) {
		this.wind_degree = wind_degree;
	}
	public String getWind_dir() {
		return wind_dir;
	}
	public void setWind_dir(String wind_dir) {
		this.wind_dir = wind_dir;
	}
	public int getPressure_mb() {
		return pressure_mb;
	}
	public void setPressure_mb(int pressure_mb) {
		this.pressure_mb = pressure_mb;
	}
	public double getPressure_in() {
		return pressure_in;
	}
	public void setPressure_in(double pressure_in) {
		this.pressure_in = pressure_in;
	}
	public int getPrecip_mm() {
		return precip_mm;
	}
	public void setPrecip_mm(int precip_mm) {
		this.precip_mm = precip_mm;
	}
	public int getPrecip_in() {
		return precip_in;
	}
	public void setPrecip_in(int precip_in) {
		this.precip_in = precip_in;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public int getCloud() {
		return cloud;
	}
	public void setCloud(int cloud) {
		this.cloud = cloud;
	}
	public double getFeelslike_c() {
		return feelslike_c;
	}
	public void setFeelslike_c(double feelslike_c) {
		this.feelslike_c = feelslike_c;
	}
	public double getFeelslike_f() {
		return feelslike_f;
	}
	public void setFeelslike_f(double feelslike_f) {
		this.feelslike_f = feelslike_f;
	}
	public double getWindchill_c() {
		return windchill_c;
	}
	public void setWindchill_c(double windchill_c) {
		this.windchill_c = windchill_c;
	}
	public double getWindchill_f() {
		return windchill_f;
	}
	public void setWindchill_f(double windchill_f) {
		this.windchill_f = windchill_f;
	}
	public double getHeatindex_c() {
		return heatindex_c;
	}
	public void setHeatindex_c(double heatindex_c) {
		this.heatindex_c = heatindex_c;
	}
	public double getHeatindex_f() {
		return heatindex_f;
	}
	public void setHeatindex_f(double heatindex_f) {
		this.heatindex_f = heatindex_f;
	}
	public double getDewpoint_c() {
		return dewpoint_c;
	}
	public void setDewpoint_c(double dewpoint_c) {
		this.dewpoint_c = dewpoint_c;
	}
	public double getDewpoint_f() {
		return dewpoint_f;
	}
	public void setDewpoint_f(double dewpoint_f) {
		this.dewpoint_f = dewpoint_f;
	}
	public int getVis_km() {
		return vis_km;
	}
	public void setVis_km(int vis_km) {
		this.vis_km = vis_km;
	}
	public int getVis_miles() {
		return vis_miles;
	}
	public void setVis_miles(int vis_miles) {
		this.vis_miles = vis_miles;
	}
	public double getUv() {
		return uv;
	}
	public void setUv(double uv) {
		this.uv = uv;
	}
	public double getGust_mph() {
		return gust_mph;
	}
	public void setGust_mph(double gust_mph) {
		this.gust_mph = gust_mph;
	}
	public double getGust_kph() {
		return gust_kph;
	}
	public void setGust_kph(double gust_kph) {
		this.gust_kph = gust_kph;
	}

}

class Day{
    public int maxtemp_c;
    public double maxtemp_f;
    public double mintemp_c;
    public double mintemp_f;
    public int avgtemp_c;
    public double avgtemp_f;
    public double maxwind_mph;
    public double maxwind_kph;
    public int totalprecip_mm;
    public int totalprecip_in;
    public int totalsnow_cm;
    public int avgvis_km;
    public int avgvis_miles;
    public int avghumidity;
    public int daily_will_it_rain;
    public int daily_chance_of_rain;
    public int daily_will_it_snow;
    public int daily_chance_of_snow;
    public Condition condition;
    public double uv;
	public Day(int maxtemp_c, double maxtemp_f, double mintemp_c, double mintemp_f, int avgtemp_c, double avgtemp_f,
			double maxwind_mph, double maxwind_kph, int totalprecip_mm, int totalprecip_in, int totalsnow_cm,
			int avgvis_km, int avgvis_miles, int avghumidity, int daily_will_it_rain, int daily_chance_of_rain,
			int daily_will_it_snow, int daily_chance_of_snow, Condition condition, double uv) {
		super();
		this.maxtemp_c = maxtemp_c;
		this.maxtemp_f = maxtemp_f;
		this.mintemp_c = mintemp_c;
		this.mintemp_f = mintemp_f;
		this.avgtemp_c = avgtemp_c;
		this.avgtemp_f = avgtemp_f;
		this.maxwind_mph = maxwind_mph;
		this.maxwind_kph = maxwind_kph;
		this.totalprecip_mm = totalprecip_mm;
		this.totalprecip_in = totalprecip_in;
		this.totalsnow_cm = totalsnow_cm;
		this.avgvis_km = avgvis_km;
		this.avgvis_miles = avgvis_miles;
		this.avghumidity = avghumidity;
		this.daily_will_it_rain = daily_will_it_rain;
		this.daily_chance_of_rain = daily_chance_of_rain;
		this.daily_will_it_snow = daily_will_it_snow;
		this.daily_chance_of_snow = daily_chance_of_snow;
		this.condition = condition;
		this.uv = uv;
	}
	public Day() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMaxtemp_c() {
		return maxtemp_c;
	}
	public void setMaxtemp_c(int maxtemp_c) {
		this.maxtemp_c = maxtemp_c;
	}
	public double getMaxtemp_f() {
		return maxtemp_f;
	}
	public void setMaxtemp_f(double maxtemp_f) {
		this.maxtemp_f = maxtemp_f;
	}
	public double getMintemp_c() {
		return mintemp_c;
	}
	public void setMintemp_c(double mintemp_c) {
		this.mintemp_c = mintemp_c;
	}
	public double getMintemp_f() {
		return mintemp_f;
	}
	public void setMintemp_f(double mintemp_f) {
		this.mintemp_f = mintemp_f;
	}
	public int getAvgtemp_c() {
		return avgtemp_c;
	}
	public void setAvgtemp_c(int avgtemp_c) {
		this.avgtemp_c = avgtemp_c;
	}
	public double getAvgtemp_f() {
		return avgtemp_f;
	}
	public void setAvgtemp_f(double avgtemp_f) {
		this.avgtemp_f = avgtemp_f;
	}
	public double getMaxwind_mph() {
		return maxwind_mph;
	}
	public void setMaxwind_mph(double maxwind_mph) {
		this.maxwind_mph = maxwind_mph;
	}
	public double getMaxwind_kph() {
		return maxwind_kph;
	}
	public void setMaxwind_kph(double maxwind_kph) {
		this.maxwind_kph = maxwind_kph;
	}
	public int getTotalprecip_mm() {
		return totalprecip_mm;
	}
	public void setTotalprecip_mm(int totalprecip_mm) {
		this.totalprecip_mm = totalprecip_mm;
	}
	public int getTotalprecip_in() {
		return totalprecip_in;
	}
	public void setTotalprecip_in(int totalprecip_in) {
		this.totalprecip_in = totalprecip_in;
	}
	public int getTotalsnow_cm() {
		return totalsnow_cm;
	}
	public void setTotalsnow_cm(int totalsnow_cm) {
		this.totalsnow_cm = totalsnow_cm;
	}
	public int getAvgvis_km() {
		return avgvis_km;
	}
	public void setAvgvis_km(int avgvis_km) {
		this.avgvis_km = avgvis_km;
	}
	public int getAvgvis_miles() {
		return avgvis_miles;
	}
	public void setAvgvis_miles(int avgvis_miles) {
		this.avgvis_miles = avgvis_miles;
	}
	public int getAvghumidity() {
		return avghumidity;
	}
	public void setAvghumidity(int avghumidity) {
		this.avghumidity = avghumidity;
	}
	public int getDaily_will_it_rain() {
		return daily_will_it_rain;
	}
	public void setDaily_will_it_rain(int daily_will_it_rain) {
		this.daily_will_it_rain = daily_will_it_rain;
	}
	public int getDaily_chance_of_rain() {
		return daily_chance_of_rain;
	}
	public void setDaily_chance_of_rain(int daily_chance_of_rain) {
		this.daily_chance_of_rain = daily_chance_of_rain;
	}
	public int getDaily_will_it_snow() {
		return daily_will_it_snow;
	}
	public void setDaily_will_it_snow(int daily_will_it_snow) {
		this.daily_will_it_snow = daily_will_it_snow;
	}
	public int getDaily_chance_of_snow() {
		return daily_chance_of_snow;
	}
	public void setDaily_chance_of_snow(int daily_chance_of_snow) {
		this.daily_chance_of_snow = daily_chance_of_snow;
	}
	public Condition getCondition() {
		return condition;
	}
	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	public double getUv() {
		return uv;
	}
	public void setUv(double uv) {
		this.uv = uv;
	}

}

class Forecast{
    public ArrayList<Forecastday> forecastday;

	public Forecast(ArrayList<Forecastday> forecastday) {
		super();
		this.forecastday = forecastday;
	}

	public Forecast() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Forecastday> getForecastday() {
		return forecastday;
	}

	public void setForecastday(ArrayList<Forecastday> forecastday) {
		this.forecastday = forecastday;
	}

}

class Forecastday{
    public String date;
    public int date_epoch;
    public Day day;
    public Astro astro;
    public ArrayList<Hour> hour;
	public Forecastday(String date, int date_epoch, Day day, Astro astro, ArrayList<Hour> hour) {
		super();
		this.date = date;
		this.date_epoch = date_epoch;
		this.day = day;
		this.astro = astro;
		this.hour = hour;
	}
	public Forecastday() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getDate_epoch() {
		return date_epoch;
	}
	public void setDate_epoch(int date_epoch) {
		this.date_epoch = date_epoch;
	}
	public Day getDay() {
		return day;
	}
	public void setDay(Day day) {
		this.day = day;
	}
	public Astro getAstro() {
		return astro;
	}
	public void setAstro(Astro astro) {
		this.astro = astro;
	}
	public ArrayList<Hour> getHour() {
		return hour;
	}
	public void setHour(ArrayList<Hour> hour) {
		this.hour = hour;
	}

}

class Hour{
    public int time_epoch;
    public String time;
    public double temp_c;
    public double temp_f;
    public int is_day;
    public Condition condition;
    public double wind_mph;
    public double wind_kph;
    public int wind_degree;
    public String wind_dir;
    public int pressure_mb;
    public double pressure_in;
    public int precip_mm;
    public int precip_in;
    public int snow_cm;
    public int humidity;
    public int cloud;
    public double feelslike_c;
    public double feelslike_f;
    public double windchill_c;
    public double windchill_f;
    public double heatindex_c;
    public double heatindex_f;
    public double dewpoint_c;
    public double dewpoint_f;
    public int will_it_rain;
    public int chance_of_rain;
    public int will_it_snow;
    public int chance_of_snow;
    public int vis_km;
    public int vis_miles;
    public double gust_mph;
    public double gust_kph;
    public double uv;
	public Hour(int time_epoch, String time, double temp_c, double temp_f, int is_day, Condition condition,
			double wind_mph, double wind_kph, int wind_degree, String wind_dir, int pressure_mb, double pressure_in,
			int precip_mm, int precip_in, int snow_cm, int humidity, int cloud, double feelslike_c, double feelslike_f,
			double windchill_c, double windchill_f, double heatindex_c, double heatindex_f, double dewpoint_c,
			double dewpoint_f, int will_it_rain, int chance_of_rain, int will_it_snow, int chance_of_snow, int vis_km,
			int vis_miles, double gust_mph, double gust_kph, double uv) {
		super();
		this.time_epoch = time_epoch;
		this.time = time;
		this.temp_c = temp_c;
		this.temp_f = temp_f;
		this.is_day = is_day;
		this.condition = condition;
		this.wind_mph = wind_mph;
		this.wind_kph = wind_kph;
		this.wind_degree = wind_degree;
		this.wind_dir = wind_dir;
		this.pressure_mb = pressure_mb;
		this.pressure_in = pressure_in;
		this.precip_mm = precip_mm;
		this.precip_in = precip_in;
		this.snow_cm = snow_cm;
		this.humidity = humidity;
		this.cloud = cloud;
		this.feelslike_c = feelslike_c;
		this.feelslike_f = feelslike_f;
		this.windchill_c = windchill_c;
		this.windchill_f = windchill_f;
		this.heatindex_c = heatindex_c;
		this.heatindex_f = heatindex_f;
		this.dewpoint_c = dewpoint_c;
		this.dewpoint_f = dewpoint_f;
		this.will_it_rain = will_it_rain;
		this.chance_of_rain = chance_of_rain;
		this.will_it_snow = will_it_snow;
		this.chance_of_snow = chance_of_snow;
		this.vis_km = vis_km;
		this.vis_miles = vis_miles;
		this.gust_mph = gust_mph;
		this.gust_kph = gust_kph;
		this.uv = uv;
	}
	public Hour() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTime_epoch() {
		return time_epoch;
	}
	public void setTime_epoch(int time_epoch) {
		this.time_epoch = time_epoch;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getTemp_c() {
		return temp_c;
	}
	public void setTemp_c(double temp_c) {
		this.temp_c = temp_c;
	}
	public double getTemp_f() {
		return temp_f;
	}
	public void setTemp_f(double temp_f) {
		this.temp_f = temp_f;
	}
	public int getIs_day() {
		return is_day;
	}
	public void setIs_day(int is_day) {
		this.is_day = is_day;
	}
	public Condition getCondition() {
		return condition;
	}
	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	public double getWind_mph() {
		return wind_mph;
	}
	public void setWind_mph(double wind_mph) {
		this.wind_mph = wind_mph;
	}
	public double getWind_kph() {
		return wind_kph;
	}
	public void setWind_kph(double wind_kph) {
		this.wind_kph = wind_kph;
	}
	public int getWind_degree() {
		return wind_degree;
	}
	public void setWind_degree(int wind_degree) {
		this.wind_degree = wind_degree;
	}
	public String getWind_dir() {
		return wind_dir;
	}
	public void setWind_dir(String wind_dir) {
		this.wind_dir = wind_dir;
	}
	public int getPressure_mb() {
		return pressure_mb;
	}
	public void setPressure_mb(int pressure_mb) {
		this.pressure_mb = pressure_mb;
	}
	public double getPressure_in() {
		return pressure_in;
	}
	public void setPressure_in(double pressure_in) {
		this.pressure_in = pressure_in;
	}
	public int getPrecip_mm() {
		return precip_mm;
	}
	public void setPrecip_mm(int precip_mm) {
		this.precip_mm = precip_mm;
	}
	public int getPrecip_in() {
		return precip_in;
	}
	public void setPrecip_in(int precip_in) {
		this.precip_in = precip_in;
	}
	public int getSnow_cm() {
		return snow_cm;
	}
	public void setSnow_cm(int snow_cm) {
		this.snow_cm = snow_cm;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public int getCloud() {
		return cloud;
	}
	public void setCloud(int cloud) {
		this.cloud = cloud;
	}
	public double getFeelslike_c() {
		return feelslike_c;
	}
	public void setFeelslike_c(double feelslike_c) {
		this.feelslike_c = feelslike_c;
	}
	public double getFeelslike_f() {
		return feelslike_f;
	}
	public void setFeelslike_f(double feelslike_f) {
		this.feelslike_f = feelslike_f;
	}
	public double getWindchill_c() {
		return windchill_c;
	}
	public void setWindchill_c(double windchill_c) {
		this.windchill_c = windchill_c;
	}
	public double getWindchill_f() {
		return windchill_f;
	}
	public void setWindchill_f(double windchill_f) {
		this.windchill_f = windchill_f;
	}
	public double getHeatindex_c() {
		return heatindex_c;
	}
	public void setHeatindex_c(double heatindex_c) {
		this.heatindex_c = heatindex_c;
	}
	public double getHeatindex_f() {
		return heatindex_f;
	}
	public void setHeatindex_f(double heatindex_f) {
		this.heatindex_f = heatindex_f;
	}
	public double getDewpoint_c() {
		return dewpoint_c;
	}
	public void setDewpoint_c(double dewpoint_c) {
		this.dewpoint_c = dewpoint_c;
	}
	public double getDewpoint_f() {
		return dewpoint_f;
	}
	public void setDewpoint_f(double dewpoint_f) {
		this.dewpoint_f = dewpoint_f;
	}
	public int getWill_it_rain() {
		return will_it_rain;
	}
	public void setWill_it_rain(int will_it_rain) {
		this.will_it_rain = will_it_rain;
	}
	public int getChance_of_rain() {
		return chance_of_rain;
	}
	public void setChance_of_rain(int chance_of_rain) {
		this.chance_of_rain = chance_of_rain;
	}
	public int getWill_it_snow() {
		return will_it_snow;
	}
	public void setWill_it_snow(int will_it_snow) {
		this.will_it_snow = will_it_snow;
	}
	public int getChance_of_snow() {
		return chance_of_snow;
	}
	public void setChance_of_snow(int chance_of_snow) {
		this.chance_of_snow = chance_of_snow;
	}
	public int getVis_km() {
		return vis_km;
	}
	public void setVis_km(int vis_km) {
		this.vis_km = vis_km;
	}
	public int getVis_miles() {
		return vis_miles;
	}
	public void setVis_miles(int vis_miles) {
		this.vis_miles = vis_miles;
	}
	public double getGust_mph() {
		return gust_mph;
	}
	public void setGust_mph(double gust_mph) {
		this.gust_mph = gust_mph;
	}
	public double getGust_kph() {
		return gust_kph;
	}
	public void setGust_kph(double gust_kph) {
		this.gust_kph = gust_kph;
	}
	public double getUv() {
		return uv;
	}
	public void setUv(double uv) {
		this.uv = uv;
	}

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
	public Location(String name, String region, String country, double lat, double lon, String tz_id,
			int localtime_epoch, String localtime) {
		super();
		this.name = name;
		this.region = region;
		this.country = country;
		this.lat = lat;
		this.lon = lon;
		this.tz_id = tz_id;
		this.localtime_epoch = localtime_epoch;
		this.localtime = localtime;
	}
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public String getTz_id() {
		return tz_id;
	}
	public void setTz_id(String tz_id) {
		this.tz_id = tz_id;
	}
	public int getLocaltime_epoch() {
		return localtime_epoch;
	}
	public void setLocaltime_epoch(int localtime_epoch) {
		this.localtime_epoch = localtime_epoch;
	}
	public String getLocaltime() {
		return localtime;
	}
	public void setLocaltime(String localtime) {
		this.localtime = localtime;
	}

}


