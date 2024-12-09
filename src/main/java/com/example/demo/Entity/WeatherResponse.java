package com.example.demo.Entity;

//import java.util.List;
//
//public class WeatherResponse {
//
//    private List<Bulk> bulk;
//    
//    public WeatherResponse() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public List<Bulk> getBulk() {
//        return bulk;
//    }
//
//    public void setBulk(List<Bulk> bulk) {
//        this.bulk = bulk;
//    }    
// 
//	public static class Bulk {
//        private Query query;
//
//        
//		public Bulk() {
//			super();
//			// TODO Auto-generated constructor stub
//		}
//
//		public Query getQuery() {
//            return query;
//        }
//
//        public void setQuery(Query query) {
//            this.query = query;
//        }
//
//        public static class Query {
//            private String customId;
//            private String q;
//            private Location location;
//            private Current current;
//
//            
//            public Query() {
//				super();
//				// TODO Auto-generated constructor stub
//			}
//
//			public String getCustomId() {
//                return customId;
//            }
//
//            public void setCustomId(String customId) {
//                this.customId = customId;
//            }
//
//            public String getQ() {
//                return q;
//            }
//
//            public void setQ(String q) {
//                this.q = q;
//            }
//
//            public Location getLocation() {
//                return location;
//            }
//
//            public void setLocation(Location location) {
//                this.location = location;
//            }
//
//            public Current getCurrent() {
//                return current;
//            }
//
//            public void setCurrent(Current current) {
//                this.current = current;
//            }
//
//            public static class Location {
//                private String name;
//                private String region;
//                private String country;
//                private double lat;
//                private double lon;
//                private String tzId;
//                private long localtimeEpoch;
//                private String localtime;
//
//                public Location() {
//					super();
//					// TODO Auto-generated constructor stub
//				}
//
//				public String getName() {
//                    return name;
//                }
//
//                public void setName(String name) {
//                    this.name = name;
//                }
//
//                public String getRegion() {
//                    return region;
//                }
//
//                public void setRegion(String region) {
//                    this.region = region;
//                }
//
//                public String getCountry() {
//                    return country;
//                }
//
//                public void setCountry(String country) {
//                    this.country = country;
//                }
//
//                public double getLat() {
//                    return lat;
//                }
//
//                public void setLat(double lat) {
//                    this.lat = lat;
//                }
//
//                public double getLon() {
//                    return lon;
//                }
//
//                public void setLon(double lon) {
//                    this.lon = lon;
//                }
//
//                public String getTzId() {
//                    return tzId;
//                }
//
//                public void setTzId(String tzId) {
//                    this.tzId = tzId;
//                }
//
//                public long getLocaltimeEpoch() {
//                    return localtimeEpoch;
//                }
//
//                public void setLocaltimeEpoch(long localtimeEpoch) {
//                    this.localtimeEpoch = localtimeEpoch;
//                }
//
//                public String getLocaltime() {
//                    return localtime;
//                }
//
//                public void setLocaltime(String localtime) {
//                    this.localtime = localtime;
//                }
//            }
//
//            public static class Current {
//                private long lastUpdatedEpoch;
//                private String lastUpdated;
//                private double tempC;
//                private double tempF;
//                private int isDay;
//                private Condition condition;
//                private double windMph;
//                private double windKph;
//                private int windDegree;
//                private String windDir;
//                private double pressureMb;
//                private double pressureIn;
//                private double precipMm;
//                private double precipIn;
//                private int humidity;
//                private int cloud;
//                private double feelslikeC;
//                private double feelslikeF;
//                private double windchillC;
//                private double windchillF;
//                private double heatindexC;
//                private double heatindexF;
//                private double dewpointC;
//                private double dewpointF;
//                private double visKm;
//                private double visMiles;
//                private double uv;
//                private double gustMph;
//                private double gustKph;
//
//                public Current() {
//					super();
//					// TODO Auto-generated constructor stub
//				}
//
//				public long getLastUpdatedEpoch() {
//                    return lastUpdatedEpoch;
//                }
//
//                public void setLastUpdatedEpoch(long lastUpdatedEpoch) {
//                    this.lastUpdatedEpoch = lastUpdatedEpoch;
//                }
//
//                public String getLastUpdated() {
//                    return lastUpdated;
//                }
//
//                public void setLastUpdated(String lastUpdated) {
//                    this.lastUpdated = lastUpdated;
//                }
//
//                public double getTempC() {
//                    return tempC;
//                }
//
//                public void setTempC(double tempC) {
//                    this.tempC = tempC;
//                }
//
//                public double getTempF() {
//                    return tempF;
//                }
//
//                public void setTempF(double tempF) {
//                    this.tempF = tempF;
//                }
//
//                public int getIsDay() {
//                    return isDay;
//                }
//
//                public void setIsDay(int isDay) {
//                    this.isDay = isDay;
//                }
//
//                public Condition getCondition() {
//                    return condition;
//                }
//
//                public void setCondition(Condition condition) {
//                    this.condition = condition;
//                }
//
//                public double getWindMph() {
//                    return windMph;
//                }
//
//                public void setWindMph(double windMph) {
//                    this.windMph = windMph;
//                }
//
//                public double getWindKph() {
//                    return windKph;
//                }
//
//                public void setWindKph(double windKph) {
//                    this.windKph = windKph;
//                }
//
//                public int getWindDegree() {
//                    return windDegree;
//                }
//
//                public void setWindDegree(int windDegree) {
//                    this.windDegree = windDegree;
//                }
//
//                public String getWindDir() {
//                    return windDir;
//                }
//
//                public void setWindDir(String windDir) {
//                    this.windDir = windDir;
//                }
//
//                public double getPressureMb() {
//                    return pressureMb;
//                }
//
//                public void setPressureMb(double pressureMb) {
//                    this.pressureMb = pressureMb;
//                }
//
//                public double getPressureIn() {
//                    return pressureIn;
//                }
//
//                public void setPressureIn(double pressureIn) {
//                    this.pressureIn = pressureIn;
//                }
//
//                public double getPrecipMm() {
//                    return precipMm;
//                }
//
//                public void setPrecipMm(double precipMm) {
//                    this.precipMm = precipMm;
//                }
//
//                public double getPrecipIn() {
//                    return precipIn;
//                }
//
//                public void setPrecipIn(double precipIn) {
//                    this.precipIn = precipIn;
//                }
//
//                public int getHumidity() {
//                    return humidity;
//                }
//
//                public void setHumidity(int humidity) {
//                    this.humidity = humidity;
//                }
//
//                public int getCloud() {
//                    return cloud;
//                }
//
//                public void setCloud(int cloud) {
//                    this.cloud = cloud;
//                }
//
//                public double getFeelslikeC() {
//                    return feelslikeC;
//                }
//
//                public void setFeelslikeC(double feelslikeC) {
//                    this.feelslikeC = feelslikeC;
//                }
//
//                public double getFeelslikeF() {
//                    return feelslikeF;
//                }
//
//                public void setFeelslikeF(double feelslikeF) {
//                    this.feelslikeF = feelslikeF;
//                }
//
//                public double getWindchillC() {
//                    return windchillC;
//                }
//
//                public void setWindchillC(double windchillC) {
//                    this.windchillC = windchillC;
//                }
//
//                public double getWindchillF() {
//                    return windchillF;
//                }
//
//                public void setWindchillF(double windchillF) {
//                    this.windchillF = windchillF;
//                }
//
//                public double getHeatindexC() {
//                    return heatindexC;
//                }
//
//                public void setHeatindexC(double heatindexC) {
//                    this.heatindexC = heatindexC;
//                }
//
//                public double getHeatindexF() {
//                    return heatindexF;
//                }
//
//                public void setHeatindexF(double heatindexF) {
//                    this.heatindexF = heatindexF;
//                }
//
//                public double getDewpointC() {
//                    return dewpointC;
//                }
//
//                public void setDewpointC(double dewpointC) {
//                    this.dewpointC = dewpointC;
//                }
//
//                public double getDewpointF() {
//                    return dewpointF;
//                }
//
//                public void setDewpointF(double dewpointF) {
//                    this.dewpointF = dewpointF;
//                }
//
//                public double getVisKm() {
//                    return visKm;
//                }
//
//                public void setVisKm(double visKm) {
//                    this.visKm = visKm;
//                }
//
//                public double getVisMiles() {
//                    return visMiles;
//                }
//
//                public void setVisMiles(double visMiles) {
//                    this.visMiles = visMiles;
//                }
//
//                public double getUv() {
//                    return uv;
//                }
//
//                public void setUv(double uv) {
//                    this.uv = uv;
//                }
//
//                public double getGustMph() {
//                    return gustMph;
//                }
//
//                public void setGustMph(double gustMph) {
//                    this.gustMph = gustMph;
//                }
//
//                public double getGustKph() {
//                    return gustKph;
//                }
//
//                public void setGustKph(double gustKph) {
//                    this.gustKph = gustKph;
//                }
//
//                public static class Condition {
//                    private String text;
//                    private String icon;
//                    private int code;
//
//                    public Condition() {
//						super();
//						// TODO Auto-generated constructor stub
//					}
//
//					public String getText() {
//                        return text;
//                    }
//
//                    public void setText(String text) {
//                        this.text = text;
//                    }
//
//                    public String getIcon() {
//                        return icon;
//                    }
//
//                    public void setIcon(String icon) {
//                        this.icon = icon;
//                    }
//
//                    public int getCode() {
//                        return code;
//                    }
//
//                    public void setCode(int code) {
//                        this.code = code;
//                    }
//                }
//            }
//        }
//    }
//
//	@Override
//	public String toString() {
//		return "WeatherResponse [bulk=" + bulk + "]";
//	}
//    
//}

import java.util.List;

public class WeatherResponse {
    private List<BulkItem> bulk;

    // Getters and Setters
    public List<BulkItem> getBulk() {
        return bulk;
    }

    public void setBulk(List<BulkItem> bulk) {
        this.bulk = bulk;
    }

    public static class BulkItem {
        private Query query;

        // Getters and Setters
        public Query getQuery() {
            return query;
        }

        public void setQuery(Query query) {
            this.query = query;
        }
    }

    public static class Query {
        private String custom_id;
        private String q;
        private Location location;
        private Current current;

        // Getters and Setters
        public String getCustom_id() {
            return custom_id;
        }

        public void setCustom_id(String custom_id) {
            this.custom_id = custom_id;
        }

        public String getQ() {
            return q;
        }

        public void setQ(String q) {
            this.q = q;
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
    }

    public static class Location {
        private String name;
        private String region;
        private String country;
        private double lat;
        private double lon;
        private String tz_id;
        private long localtime_epoch;
        private String localtime;

        // Getters and Setters
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

        public long getLocaltime_epoch() {
            return localtime_epoch;
        }

        public void setLocaltime_epoch(long localtime_epoch) {
            this.localtime_epoch = localtime_epoch;
        }

        public String getLocaltime() {
            return localtime;
        }

        public void setLocaltime(String localtime) {
            this.localtime = localtime;
        }
    }

    public static class Current {
        private long last_updated_epoch;
        private String last_updated;
        private double temp_c;
        private double temp_f;
        private int is_day;
        private Condition condition;
        private double wind_mph;
        private double wind_kph;
        private int wind_degree;
        private String wind_dir;
        private double pressure_mb;
        private double pressure_in;
        private double precip_mm;
        private double precip_in;
        private int humidity;
        private int cloud;
        private double feelslike_c;
        private double feelslike_f;
        private double windchill_c;
        private double windchill_f;
        private double heatindex_c;
        private double heatindex_f;
        private double dewpoint_c;
        private double dewpoint_f;
        private double vis_km;
        private double vis_miles;
        private double uv;
        private double gust_mph;
        private double gust_kph;

        // Getters and Setters
        public long getLast_updated_epoch() {
            return last_updated_epoch;
        }

        public void setLast_updated_epoch(long last_updated_epoch) {
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

        public double getPressure_mb() {
            return pressure_mb;
        }

        public void setPressure_mb(double pressure_mb) {
            this.pressure_mb = pressure_mb;
        }

        public double getPressure_in() {
            return pressure_in;
        }

        public void setPressure_in(double pressure_in) {
            this.pressure_in = pressure_in;
        }

        public double getPrecip_mm() {
            return precip_mm;
        }

        public void setPrecip_mm(double precip_mm) {
            this.precip_mm = precip_mm;
        }

        public double getPrecip_in() {
            return precip_in;
        }

        public void setPrecip_in(double precip_in) {
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

        public double getVis_km() {
            return vis_km;
        }

        public void setVis_km(double vis_km) {
            this.vis_km = vis_km;
        }

        public double getVis_miles() {
            return vis_miles;
        }

        public void setVis_miles(double vis_miles) {
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

    public static class Condition {
        private String text;
        private String icon;
        private int code;

        // Getters and Setters
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
}

