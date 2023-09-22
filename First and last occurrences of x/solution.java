class GFG {
    ArrayList<Integer> find(int arr[], int n, int x) {
        int left = bs1(arr, n, x);
        int right = bs2(arr, n, x);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(left, right));

        return list;
    }

    public int bs1(int arr[], int n, int x) {
        int left = 0;
        int right = n - 1;
        int res = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                res = mid; // Update res when x is found
                right = mid - 1; // Continue searching on the left side
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }

    public int bs2(int arr[], int n, int x) {
        int left = 0;
        int right = n - 1;
        int res = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                res = mid; // Update res when x is found
                left = mid + 1; // Continue searching on the right side
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
}
