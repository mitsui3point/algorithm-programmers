// https://school.programmers.co.kr/learn/courses/18/lessons/1878

function solution(v) {
    var x = {};
    var y = {};
    var xKeys = [];
    var yKeys = [];
    for(var i = 0; i < v.length; i++) {
        var currX = v[i][0];
        var currY = v[i][1];
        x[currX] = (x[currX] === undefined ? 1 : x[currX] + 1)
        y[currY] = (y[currY] === undefined ? 1 : y[currY] + 1)
        if(!xKeys.includes(currX)) {
            xKeys.push(currX);
        }
        if(!yKeys.includes(currY)) {
            yKeys.push(currY)
        }
    }
    var answer = [
        []
    ];
    for(var idx = 0; idx < 2; idx++) {
        var xKey = xKeys[idx];
        var yKey = yKeys[idx];
        var xValue = x[xKey];
        var yValue = y[yKey];

        if(xValue < 2) {
            answer[0] = xKey;
        }
        if(yValue < 2) {
            answer[1] = yKey;
        }
    }

    console.log(answer)

    return answer;
}

var v = [[1, 4], [3, 4], [3, 10]]; //[[1, 1], [2, 2], [1, 2]];
solution(v);