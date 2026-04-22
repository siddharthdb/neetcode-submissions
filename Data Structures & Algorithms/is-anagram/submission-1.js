class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if (s.length !== t.length) {
            return false;
        }

        const sMap = new Map();
        const tMap = new Map();

        for (let i = 0; i < s.length; i++) {
            if (sMap.has(s.charAt(i))) {
                sMap.set(s.charAt(i), sMap.get(s.charAt(i)) + 1)
            } else {
                sMap.set(s.charAt(i), 1)
            }

            if (tMap.has(t.charAt(i))) {
                tMap.set(t.charAt(i), tMap.get(t.charAt(i)) + 1)
            } else {
                tMap.set(t.charAt(i), 1)
            }
        } 

        for (const k of sMap.keys()) {
            if (!tMap.has(k) || tMap.get(k) !== sMap.get(k)) {
                return false;
            }
        }

        return true;
    }
}
