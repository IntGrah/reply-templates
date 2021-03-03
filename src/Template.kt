package com.reply

import java.io.*
import java.util.*

val sc = Scanner(File("input.txt"))
val pw = PrintWriter(File("output.txt"))

fun solve() {
    val N = sc.nextInt()

    // TODO

    pw.println(N)
}


fun main() {
    val T = sc.nextInt()
    for (t in 1..T) {
        pw.printf("Case #%d: ", t)
        solve()
    }
    pw.close()
}
