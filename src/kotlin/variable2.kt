package kotlin

//형 변환도 사용 가능
fun main() {

    var a = 30
    var b = 30L

   // b = a 코틀린에서는 자바와 다르게 형이 다르면 형 크기에 상관없이 대입이 안되기에 무조건 아래와 같이 형변환 해줘야함
    b= a.toLong()
}