package homework.lesson8.genericRobots;

import homework.lesson8.genericRobots.BodyType;
import homework.lesson8.genericRobots.HeadType;

public class Robot<H, B> {
    private String name;
    private H head;
    private B body;

    public Robot(String name, H head, B body) {
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

    public H getHead() {
        return head;
    }

    public void setHead(H head) {
        this.head = head;
    }

    public B getBody() {
        return body;
    }

    public void setBody(B body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", head=" + head +
                ", body=" + body +
                '}';
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
}