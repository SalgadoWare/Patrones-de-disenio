package editor.tools;

import editor.*;
import editor.figures.Circle;
import editor.figures.Figure;
import editor.tools.*;

public class CircleCreationTool extends AbstractCreationTool implements Tool 
{	
	public CircleCreationTool(Editor editor)
	{
		super(editor);
	}
	
	@Override
	protected Figure createFigure(BoundingBox boundingBox) 
	{
		return new Circle(boundingBox);
	}

	@Override
	public String toString()
	{
		return "Círculo (herramienta de creación de)";
	}
}
