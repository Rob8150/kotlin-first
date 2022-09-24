fun getRandomString(length: Int) : String {
    val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    return (1..length)
        .map { allowedChars.random() }
        .joinToString("")
}

fun getIPPART() : String {
    val rnds = (0..256).random()
    val s = rnds.toString()
    return s
}

fun getHexString(length: Int) : String {
    val allowedChars = ('A'..'F') + ('0'..'9')
    return (1..length)
        .map { allowedChars.random() }
        .joinToString("")
}

fun getBlock(length: Int) : String {
    var s : String
    var build : String =""
    for (i in 2..length){
        s = getHexString(2)
        build = build + s + ":"
    }
    s= getHexString(2)
    build = build + s
    return build
}

fun getIPBlock(length: Int) : String {
    var s : String
    var build : String =""
    for (i in 2..length){
        s = getIPPART()
        build = build + s + ":"
    }
    s= getIPPART()
    build = build + s
    return build
}

fun main(args: Array<String>) {
    val ip=getIPBlock(4)
    println("WI-FI Express fix $ip")
    var str  = getRandomString(32)
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")
    println("SSID: $str")
    str = getBlock(6)
    println("Sending De-auth packet to PSID: $str")
    println("Sending De-auth packet to PSID: $str")
    println("Sending De-auth packet to PSID: $str")
    println("Sending De-auth packet to PSID: $str")
    println("Sending De-auth packet to PSID: $str")
    println("Sending De-auth packet to PSID: $str")

}