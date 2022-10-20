public class Coupon {
    public static void main(String[] args){
        char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int random=(int) (Math.random()*100000000);
        StringBuffer sb=new StringBuffer();
        while (random>0)
        {
            sb.append(chars[random % chars.length]);
            random = random / chars.length;
        }
        String couponCode=sb.toString();
        System.out.println("Coupon code : "+couponCode);
    }
}
