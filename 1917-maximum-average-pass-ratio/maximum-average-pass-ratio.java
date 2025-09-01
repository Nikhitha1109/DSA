import java.util.PriorityQueue;

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        // Max-heap: class with largest gain comes first
        PriorityQueue<ClassInfo> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(b.gain(), a.gain())
        );

        // Load initial classes into heap
        for (int[] c : classes) {
            pq.offer(new ClassInfo(c[0], c[1]));
        }

        // Assign all extra students
        for (int i = 0; i < extraStudents; i++) {
            ClassInfo best = pq.poll();
            best.addStudent();  // update pass/total
            pq.offer(best);
        }

        // Calculate final average
        double sum = 0.0;
        while (!pq.isEmpty()) {
            ClassInfo c = pq.poll();
            sum += c.ratio();
        }
        return sum / classes.length;
    }

    // Helper class for readability
    static class ClassInfo {
        int pass, total;

        ClassInfo(int p, int t) {
            this.pass = p;
            this.total = t;
        }

        void addStudent() {
            pass++;
            total++;
        }

        double ratio() {
            return (double) pass / total;
        }

        double gain() {
            return (double)(pass + 1) / (total + 1) - ratio();
        }
    }
}
