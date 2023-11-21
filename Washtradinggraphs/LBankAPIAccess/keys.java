class KeysClass {
    public static void main (String[] args) {
        // RSA_Sign(preparedStr, secretKey);
        // getPrivateKey(key);
        // HmacSHA256_Sign(preparedStr, secretKey);
        System.out.println("Hello, World.");
    }
}
//     String secretKey = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAJ5kGgvR2jfPtOa/dHXMzkl+rGeyRPTSa+HTQNozbnGc4hux/z2AdDn4N8KzmCgRmEUjLalR5MQQZLykjISL7ppfrJE1fbD9RozKf7Im5lVI+5s1moBfokpsWrA/HmBqgRs48OM1il5r3ibKiSywTzI7B89e0cX+kwdgewa3woQLAgMBAAECgYAidh8goTj8Wam/Zrp9AuGDJhd2vFe6eKnWSXNbxkLqXzrm0bR5+h/PmQzwxMh/N0zNBhliNJo0emigjqCwGg4AmtjsdESip9aNyvm0NDyVhXMtbf2rhmQFLtjFJ5DyVmiVpzioRhyaT0ygBdGmh2Nom+R18YTF0BiyV21LaRtwIQJBAM3trhK3PzKpgMSKhHmbOEST0VPVFbRKZD1a6Flhtm9e715JaE6JG27E1Jy1IRkp96ALExw1n8hmyDBNVnCWd3ECQQDE52KVtlwF8j5IpXYaSxmIml2wz1qLwNPWYZLtpxXkvyyX/K3JdJ+vSg8mfbx3464z/IFD3y6UkEa5+oqxqE07AkA/CC1sFSMHAtMjVbLO9i/27bf5DRQjp1GfZiAQm9QXqtth5N5Ei7sV4LGjdd23shzVpA4paFCMKsnD3yhCNgxBAkEAhPjFiNkn+BQJn8GtqkABNFEa6GZ/fVVxOZuXP8rQbDP2h4VqT1vk4tmetZ3AAy7M2+qv2QgFSurL+JiLxUIlNQJBAMTSr3X2EAejhHulhhCP3x7HupCN+2nbx0Hx0bEo2UnUgys43JJ7yir+TwW3lMdr/wLAelp2ioI27NaED/BSSQk=";
//     String apiKey = "d843d542-c9d9-49d6-9218-5363c948916f";
//     String contentType = "application/x-www-form-urlencoded";
//     String timestamp = curl("https://api.lbkex.com/v2/timestamp.do");
//     String signature_method = "RSA/HmacSHA256";
//     String echostr = "SDK";

//     // RSA example:

//     public static String RSA_Sign(String preparedStr, String secretKey) {
//         try {
//             PrivateKey priKey = getPrivateKey(secretKey);
//             Signature signature = Signature.getInstance("SHA256WithRSA");
//             signature.initSign(priKey);
//             signature.update(content.getBytes(CharEncoding.UTF_8));
//             byte[] signed = signature.sign();
//             return new String(Base64.getEncoder().encode(signed));
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         return null;
//     }

//     private static PrivateKey getPrivateKey(String key) {
//         PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(key));
//         PrivateKey privateKey = null;
//         try { 
//             KeyFactory keyFactory = KeyFactory.getInstance(RSA);
//             privateKey = keyFactory.generatePrivate(keySpec);
//         } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
//             e.printStackTrace();
//         }
//         return privateKey;
//     }

//     // HmacSHA256 example:
//     public static String HmacSHA256_Sign(String preparedStr, String secretKey) {
//         String hash = "";
//         try {
//             Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
//             SecretKeySpec secret_key = new SecretKeySpec(secretKey.getBytes(), "HmacSHA256");
//             sha256_HMAC.init(secret_key);
//             byte[] bytes = sha256_HMAC.doFinal(message.getBytes());
//             hash = byteArrayToHexString(bytes);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         return hash;
//     }
// }



