class Masaxista(id: Int, nome: String): Seleccion(id, nome) {
    var titulacion: String = ""
    var anosExperiencia: Int = 0

    constructor (titulacion: String, anosExperiencia: Int, id: Int, nome: String) : this(id, nome) {
        this.titulacion = titulacion
        this.anosExperiencia = anosExperiencia
        this.id = id
        this.nome = nome
    }

    override fun concentrarse() {
        println("Concéntrase o masaxista")
    }

    override fun viaxar() {
        println("Viaxa o masaxista")
    }
}