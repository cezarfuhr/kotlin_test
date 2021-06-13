import com.fasterxml.jackson.databind.ObjectMapper

fun main() {
    val user = User("Cezar")
    println("my nams is ${user.}")
}

class User(name: String) {
    val name = name
}

private fun toJson(obj: Any): String {
    return try {
        objectMapper.writeValueAsString(obj)
    } catch (e: JsonProcessingException) {
        throw RuntimeException(e)
    }
}