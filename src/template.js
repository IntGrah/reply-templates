const fs = require("fs"),
    IN_PATH = "input.txt",
    OUT_PATH = "output.txt",
    io = {
    i: 0,
    data: fs.readFileSync(IN_PATH, "ascii").split(/\s+/),
    next: () => io.data[io.i++],
    int: () => Number(io.next()),
    print: (data) => fs.writeFileSync(OUT_PATH, data + "", {flag: "as"}),
    println: (data) => io.print(data + "\n")
};
fs.writeFileSync(OUT_PATH, "", {flag: "w"});

function solve() {
    let N = io.int();

    // TODO

    io.println(N);
}

const T = io.int();
for (let t = 1; t <= T; ++t) {
    io.print(`Case #${t}: `);
    solve();
}