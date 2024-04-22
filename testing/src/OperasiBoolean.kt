fun main() {

    val NilaiUjian = 100;
    val NilaiAbsen = 80;
    val NilaiExtra = 80;

    val ApakahLulusUjian = NilaiUjian > 75
    val ApakahLulusAbsen = NilaiAbsen > 75
    val ApakahLulusExtra = NilaiExtra > 75

    val NaikKelas = ApakahLulusUjian && ApakahLulusAbsen || ApakahLulusExtra

    println(NaikKelas)


}