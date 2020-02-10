package com.example.fancrud.Student

class ApiEndPoint {
    companion object {

        private val SERVER = "https://fancrud.000webhostapp.com/"
        val CREATE = SERVER +"create.php"
        val READ = SERVER +"read.php"
        val DELETE = SERVER +"delete.php"
        val UPDATE = SERVER +"update.php"

    }
}