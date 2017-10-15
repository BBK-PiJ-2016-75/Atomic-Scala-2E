// Exercise03.sc

val sky = "sunny"
val temp = 30
val someSunHotOrCold = (sky == "sunny" || sky == "partly cloudy") && (temp > 25 || temp < 0)
println(someSunHotOrCold)
