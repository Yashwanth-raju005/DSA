class MedianFinder {

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public MedianFinder() {

    }

    public void addNum(int num) {

        if (maxHeap.isEmpty() || num < maxHeap.peek()) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }

        //always maintain left heap size should be more than right size || equal 

        if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());
        } else if (Math.abs(maxHeap.size() - minHeap.size()) > 1) {
            minHeap.add(maxHeap.poll());
        }

    }

    public double findMedian() {

        if (maxHeap.size() == minHeap.size()) {

            double median = (double)(maxHeap.peek() + minHeap.peek())/2;

            return median;

        } else {
            return maxHeap.peek();
        }

    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */