package homework.lesson7.robots;

public class Robot {
    private String name;
    private Head head;
    private Body body;

    public Robot(String name, Head head, Body body) {
        this.name = name;
        this.head = head;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return name + " [голова=" + head + ", туловище=" + body + "]";
    }

    public static class Head {
        private HeadType type;

        public Head(HeadType type) {
            this.type = type;
        }

        public HeadType getType() {
            return type;
        }

        public void setType(HeadType type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return type.getTitle();
        }
    }

    public static class Body {
        private BodyType type;

        public Body(BodyType type) {
            this.type = type;
        }

        public BodyType getType() {
            return type;
        }

        public void setType(BodyType type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return type.getTitle();
        }
    }
    /////
}