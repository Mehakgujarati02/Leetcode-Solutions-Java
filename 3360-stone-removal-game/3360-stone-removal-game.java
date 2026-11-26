class Solution {
    public boolean canAliceWin(int n) {
        int remove = 10;
        boolean aliceTurn = true;

        while (n >= remove) {
            n -= remove;
            remove--;
            aliceTurn = !aliceTurn;
        }

        return !aliceTurn;
    }
}//tc:- O(1), sc:- O(1) as the gane doesat most 10 runs