function areAnagrams(str1, str2) {
    if (str1.length !== str2.length) {
        return false;
    }
    
    const freq1 = {};
    const freq2 = {};
    
    for (let char of str1) {
        freq1[char] = (freq1[char] || 0) + 1;
    }
    
    for (let char of str2) {
        freq2[char] = (freq2[char] || 0) + 1;
    }
    
    for (let key in freq1) {
        if (freq1[key] !== freq2[key]) {
            return false;
        }
    }
    
    return true;
}

// Test cases
console.log("Test 1 - listen vs silent:", areAnagrams("listen", "silent"));
console.log("Test 2 - hello vs world:", areAnagrams("hello", "world"));
console.log("Test 3 - abc vs cba:", areAnagrams("abc", "cba"));
console.log("Test 4 - test vs best:", areAnagrams("test", "best"));