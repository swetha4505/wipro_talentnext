import java.io.*;
import java.util.*;
public class Ex {
    static int N, M, V;
    static int[][] grid;
    static List<Integer>[] graph;
    static List<Integer>[] reverseGraph;
    static boolean[] visited;
    static ArrayList<Integer> order;
    static int[] comp;
    static int label = 0;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int nodeId(int x, int y) {
        return x * M + y;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = N * M;

        grid = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        graph = new ArrayList[V];
        reverseGraph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
            reverseGraph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int u = nodeId(i, j);
                for (int d = 0; d < 4; d++) {
                    int ni = i + dx[d];
                    int nj = j + dy[d];
                    if (ni >= 0 && ni < N && nj >= 0 && nj < M) {
                        if (grid[ni][nj] >= grid[i][j]) {
                            int v = nodeId(ni, nj);
                            graph[v].add(u);
                            reverseGraph[u].add(v);
                        }
                    }
                }
            }
        }

        visited = new boolean[V];
        order = new ArrayList<>();
        for (int u = 0; u < V; u++) {
            if (!visited[u]) {
                dfs1(u);
            }
        }

        comp = new int[V];
        Arrays.fill(comp, -1);
        for (int i = order.size() - 1; i >= 0; i--) {
            int u = order.get(i);
            if (comp[u] == -1) {
                dfs2(u, label);
                label++;
            }
        }

        int[] indegree = new int[label];
        for (int u = 0; u < V; u++) {
            for (int v : graph[u]) {
                if (comp[u] != comp[v]) {
                    indegree[comp[v]]++;
                }
            }
        }

        int ans = 0;
        for (int deg : indegree) {
            if (deg == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    static void dfs1(int u) {
        visited[u] = true;
        for (int v : graph[u]) {
            if (!visited[v]) {
                dfs1(v);
            }
        }
        order.add(u);
    }

    static void dfs2(int u, int label) {
        comp[u] = label;
        for (int v : reverseGraph[u]) {
            if (comp[v] == -1) {
                dfs2(v, label);
            }
        }
    }
}
