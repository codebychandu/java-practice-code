import tkinter as tk

# Create a main application window
root = tk.Tk()
root.title("Simple GUI")

# Create a label widget
label = tk.Label(root, text="Hello, GUI!")
label.pack()

# Run the main event loop
root.mainloop()
