class EventImpl implements Event {

	@Override
	public void perform() {
		System.out.println("First Performance");
	}

}

public class EventDemo {

	class InnerEventImpl implements Event {

		@Override
		public void perform() {
			System.out.println("Second Performance");
		}

	}

	static class StaticInnerEventImpl implements Event {

		@Override
		public void perform() {
			System.out.println("Third Performance");
		}

	}

	public void anotherEvent() {
		class NestedEventImpl implements Event {

			@Override
			public void perform() {
				System.out.println("Fourth Performance");
			}
		}
		;
		new NestedEventImpl().perform();
	}

	public void oneMoreEvent() {
		Event e = new Event() { //Anonymous Inner Class
			@Override
			public void perform() {
				System.out.println("Fifth Performance");
			}
		};
		e.perform();
	}
	
	public void oneLastEvent() {
		Event e = () -> System.out.println("Sixth performance");
		e.perform();
	}

	public static void main(String[] args) {
		EventImpl ei = new EventImpl();
		ei.perform();

		EventDemo ed = new EventDemo();
		InnerEventImpl ie = ed.new InnerEventImpl();
		ie.perform();

		EventDemo.StaticInnerEventImpl se = new StaticInnerEventImpl();
		se.perform();

		ed.anotherEvent();
		ed.oneMoreEvent();
		ed.oneLastEvent();
	}

}
