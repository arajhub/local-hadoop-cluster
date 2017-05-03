drop table airline_ext;
create external table airline_ext (
Years int,
Months int,              
DayofMonths int,         
DayOfWeek int,          
DepTime int,           
CRSDepTime int,        
ArrTime int,           
CRSArrTime int,        
UniqueCarrier STRING,   
FlightNum int,         
TailNum STRING,         
ActualElapsedTime int, 
CRSElapsedTime int,    
AirTime STRING,         
ArrDelay int,          
DepDelay int,          
Origin STRING,           
Dest STRING,             
Distance int,          
TaxiIn STRING,          
TaxiOut STRING,         
Cancelled int,          
CancellationCode STRING,
Diverted int,           
CarrierDelay STRING,    
WeatherDelay STRING,    
NASDelay STRING,        
SecurityDelay STRING,   
LateAircraftDelay STRING
)ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION "/user/araj/airline/1988"
tblproperties ("skip.header.line.count"="1");

-- Create managed table with ORC format and insert data into this table from external table.
drop table if exists airline_orc;
CREATE TABLE
    airline_orc
    (
        Years INT,
        Months INT,
        DayofMonths INT,
        DayOfWeek INT,
        DepTime INT,
        CRSDepTime INT,
        ArrTime INT,
        CRSArrTime INT,
        UniqueCarrier STRING,
        FlightNum INT,
        TailNum STRING,
        ActualElapsedTime INT,
        CRSElapsedTime INT,
        AirTime STRING,
        ArrDelay INT,
        DepDelay INT,
        Origin STRING,
        Dest STRING,
        Distance INT,
        TaxiIn STRING,
        TaxiOut STRING,
        Cancelled INT,
        CancellationCode STRING,
        Diverted INT,
        CarrierDelay STRING,
        WeatherDelay STRING,
        NASDelay STRING,
        SecurityDelay STRING,
        LateAircraftDelay STRING
    )
    STORED AS ORC;
	
-- Create managed table with parquet format and insert data into this table from external table.
drop table if exists airline_parquet;
CREATE TABLE
    airline_parquet
    (
        Years INT,
        Months INT,
        DayofMonths INT,
        DayOfWeek INT,
        DepTime INT,
        CRSDepTime INT,
        ArrTime INT,
        CRSArrTime INT,
        UniqueCarrier STRING,
        FlightNum INT,
        TailNum STRING,
        ActualElapsedTime INT,
        CRSElapsedTime INT,
        AirTime STRING,
        ArrDelay INT,
        DepDelay INT,
        Origin STRING,
        Dest STRING,
        Distance INT,
        TaxiIn STRING,
        TaxiOut STRING,
        Cancelled INT,
        CancellationCode STRING,
        Diverted INT,
        CarrierDelay STRING,
        WeatherDelay STRING,
        NASDelay STRING,
        SecurityDelay STRING,
        LateAircraftDelay STRING
    )
    STORED AS PARQUET;



