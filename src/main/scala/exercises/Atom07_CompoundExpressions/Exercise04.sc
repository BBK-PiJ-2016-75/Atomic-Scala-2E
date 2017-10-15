// Exercise04.sc

val activity = "walking"
//val activity = "running"
//val activity = "biking"
val distance = 2.5

val willDo = {
  if (activity == "walking") {
    distance >= 0 && distance <= 1.61
  } else if (activity == "running") {
    distance >= 0 && distance <= 9.66
  } else if (activity == "biking") {
    distance >= 0 && distance <= 32.19
  } else {
    false
  }
}
println(activity + ": " + willDo)

// run 3 times: once for each activity
/* Output:
walking: false
running: true
biking: true
 */
