// Exercise03.sc

// Uncomment these one at a time:
val activity = "swimming"
//val activity = "walking"
//val activity = "biking"
//val activity = "couch"
val hour = 8
val temp = 7.5

val isOpen = {
  if (activity == "swimming") {
    val opens = 9
    val closes = 20
    if (hour >= opens && hour <= closes) {
      true
    } else {
      false
    }
  } else {
    true
  }
}

val goodTemperature = {
  if (activity == "swimming") {
    if (temp >= 25) {
      true
    } else {
      false
    }
  } else if (activity == "biking") {
    if (temp >= 10) {
      true
    } else {
      false
    }
  } else {
    true
  }
}

val doActivity = isOpen && goodTemperature
println(activity + ": " + isOpen + " && " + goodTemperature + " = " + doActivity)

// run 4 times: once for each activity
/* Output:
swimming: false && false = false
walking: true && true = true
biking: true && false = false
couch: true && true = true
 */
