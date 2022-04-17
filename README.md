# IDEA-algorithm

数据结构和算法，在IDEA中实现

需要复习的知识点： java中treemap和hashmap的区别是什么？ 
1、HashMap中元素是没有顺序的；TreeMap中所有元素都是有某一固定顺序的。
2、HashMap继承AbstractMap类，是基于hash表实现的；TreeMap继承SortedMap类，是基于红黑树实现的。

重写比较器
    // 方法三: 使用list并自己实现Comparator, 比较能体现算法的思路
    public static void withComparator() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        String s = "";
        while ((s = br.readLine()) != null) {
            list.add(s);
        }
        br.close();
 
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int i = 0;
                while (i < s1.length() && i < s2.length()) {
                    if (s1.charAt(i) != s2.charAt(i)) {
                        return (s1.charAt(i) > s2.charAt(i))? 1: -1;
                    }
                    i++;
                }
                if (s1.length() == s2.length()) {
                    return 0;
                } else {
                    return (s1.length() > s2.length())? 1: -1;
                }
            }
        });
 
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

HJ35 蛇形矩阵
HJ54 表达式求值