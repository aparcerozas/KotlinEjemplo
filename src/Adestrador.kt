class Adestrador(id: Int, nome: String): Seleccion(id, nome) {
    var idFederacion: Int = 0

    constructor (idFederacion: Int, id: Int, nome: String) : this(id, nome) {
        this.idFederacion = idFederacion
        this.id = id
        this.nome = nome
    }

    override fun concentrarse() {
        println("Concéntrase o adestrador")
    }

    override fun viaxar() {
        println("Viaxa o adestrador")
    }

}