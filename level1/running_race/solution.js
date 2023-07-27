// https://school.programmers.co.kr/learn/courses/30/lessons/178871

function solution(players, callings) {
    var answer = [];
    for(var calling of callings) {
        var index = players.indexOf(calling)
        var temp = players[index - 1]
        players[index - 1] = calling
        players[index] = temp
    }
    answer = players
    return answer;
}