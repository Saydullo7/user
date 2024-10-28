import com.google.gson.Gson

data class User(
    val name:String = "",
    val sourname:String = "",
    val age:Int = 0,
    val adress:String = ""

)

fun main(){
    val gson = Gson()
    val user = User("saydullo", "jorahonov",14,"ulugvor 189")
    val gsonString = gson.toJson(user)
    println(gsonString)
}

