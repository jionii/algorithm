def solution(n, s, a, b, fares):
    INF = 200 * 100_000
    map = [[INF] * (n+1) for _ in range(n+1)]
    
    for i in range(1, n+1):
        map[i][i] = 0
        
    for u, v, w in fares:
        map[u][v] = w
        map[v][u] = w
        
    for k in range(1, n+1):
        for i in range(1, n+1):
            for j in range(1, n+1):
                if map[i][j] > map[i][k] + map[k][j]:
                    map[i][j] = map[i][k] + map[k][j]
                    
    answer = map[s][a] + map[s][b]
    
    for i in range(1, n+1):
        answer = min(answer, map[s][i] + map[i][a] + map[i][b])
        
    return answer