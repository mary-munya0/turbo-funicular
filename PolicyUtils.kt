fun isHighPriority(priority: Int): Boolean {
    return priority == 1 || priority == 2
}

fun formatPolicyName(name: String): String {
    return "POLICY: ${name.uppercase()}"
}

fun main(){
//    isHighPriority
    println("Priority 3 high?: ${isHighPriority(3)}")
    println("Priority 2 high?: ${isHighPriority(2)}")
//    formatPolicyName
    println(formatPolicyName("Block Telnet"))
//Control flow
    val statuses = listOf("pending", "active", "inactive", "outdated")
    for(status in statuses){
        when (status) {
            "pending" -> {
                print("This policy is pending.\n")
            }
            "active" -> {
                print("This policy is active.\n")
            }
            "inactive" -> {
                print("This policy is inactive.\n")
            }
            else -> {
                print("This policy status is unknown.\n")
            }
        }
    }

//    firewall names and foreach
    val firewallNames = listOf(
        "Allow HTTP Traffic",
        "Block FTP Access",
        "Restrict SSH",
        "Allow HTTPS Traffic",
        "Block Telnet"
    )

    firewallNames.forEach { firewallName ->
        println("Firewall: $firewallName")
    }
//    Policies with statuses
    val policies = mapOf(
        "Allow Http Traffic" to "Active",
        "Block FTP Access" to "Inactive",
        "Restrict SSH" to "Pending",
    )
    policies.forEach { (policy, status) ->
        println("Policy: $policy | Status: $status")
    }
}