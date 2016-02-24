package homework2;
/**
 * 
 * @author FedorRB
 * @version 1.1
 */
public class Board {
	private Shape[] shapeArray = new Shape[4];

	public Board() {
		super();
	}
	
	public int getMaxNumberBoard(){
		return shapeArray.length;
	}	
	
	public int addShape(Shape shape){
		for(int i = 0; i < shapeArray.length; i++){
			if(shapeArray[i] == null){
				shapeArray[i] = shape;
				return (i + 1);
			}
		}
		System.out.println("Board is fool. Clear it.");		
		return 0;
	}
	
	public void delShape(int partNumber){
		partNumber--;
		if (partNumber < 0 || partNumber > shapeArray.length - 1) {
			System.out.println("Wrong input");
			return;
		}
		shapeArray[partNumber] = null;		
	}
	
	public boolean replaceShape(Shape shape, int partNumber){
		boolean result = false;
		partNumber--;
		if(partNumber >= 0 && partNumber < shapeArray.length){
			shapeArray[partNumber] = shape;
			result = true;
		}
		return result;
	}
	
	public void clearBoard(){
		for(int i = 0; i < shapeArray.length; i++){
			shapeArray[i] = null;
		}
	}

	public boolean isPartHasShape(int partNumber){
		partNumber--;
		if (partNumber >= 0 && partNumber < shapeArray.length) {
			if(shapeArray[partNumber] != null)
				return true;
			else
				return false;
		}
		System.out.println("Wrong input");
		return false;
	}

	
	@Override
	public String toString() {
		double totalArea = 0;
		/*
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < shapeArray.length; i++) {
			if (shapeArray[i] != null) {
				sb.append((i + 1) + ") " + shapeArray[i] + "\n");
				totalArea += shapeArray[i].area(); 
			} else {
				sb.append((i + 1) + ") Free \n");
			}
		}
		sb.append(String.format("Total area = %.2f", totalArea));		
		*/
		//foreach
		StringBuilder sb = new StringBuilder();
		for (Shape shape: shapeArray) {
			if (shape != null) {
				sb.append(shape + "\n");
				totalArea += shape.area(); 
			} else {
				sb.append(" Free \n");
			}
		}
		sb.append(String.format("Total area = %.2f", totalArea));		
		return sb.toString();
	}
}
