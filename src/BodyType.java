public enum BodyType {
    SEDAN("седан"),
    HATCHBACK("хетчбек"),
    COUPE("купе"),
    UNIVERSAL("универсал"),
    SUV("внедорожник"),
    CROSSOVER("кроссовер"),
    PICKUP("пикап"),
    VAN("фургон"),
    MINIVAN("минивэн");
    String bodyType;

    BodyType(String bodyType) {
        this.bodyType = bodyType;
    }
}
