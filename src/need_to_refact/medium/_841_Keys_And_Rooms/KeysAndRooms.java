package need_to_refact.medium._841_Keys_And_Rooms;

import java.util.List;

public class KeysAndRooms {
    public static void main(String[] args) {

    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];

        dfs(0, rooms, visited);
        for (int i = 0; i < rooms.size(); i++) {
            if (!visited[i]) return false;
        }
        return true;
    }

    public void dfs(int node, List<List<Integer>> rooms, boolean[] visited) {
        visited[node] = true;

        for (Integer room : rooms.get(node)) {
            if (!visited[room]) {
                dfs(room, rooms, visited);
            }
        }

    }


}
