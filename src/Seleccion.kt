open class Seleccion {
    var id: Int = 0
    var nome: String  = ""

    constructor (id: Int, nome: String) {
        this.id = id
        this.nome = nome
    }

    open fun concentrarse () {
        println("Concéntrase a selección")
    }

    open fun viaxar () {
        println("Viaxa a selección")
    }

    override fun toString(): String {
        return "ID: $id, Nome: $nome"
    }

}