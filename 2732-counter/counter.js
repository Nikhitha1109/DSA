var createCounter = function(n) {
    return function() {
        return n++;
    };
};

const counter = createCounter(10);

let result = [];

for (let i = 0; i < 3; i++) {
    result.push(counter());
}

console.log(result);