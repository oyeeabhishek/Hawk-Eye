from flask import Flask, render_template, request, Markup
import numpy as np
import pandas as pd
import pickle

crop_recommendation_model_path = 'pickleModel'
crop_recommendation_model = pickle.load(open(crop_recommendation_model_path, 'rb'))

app = Flask(__name__)

# render crop recommendation form page


@ app.route('/')
def crop_recommend():
    title = 'Yield'
    return render_template('crop.html', title=title)

@ app.route('/crop-predict', methods=['POST'])
def crop_prediction():
    title = 'Harvestify - Crop Recommendation'

    if request.method == 'POST':
        Latitude = float(request.form['Latitude'])
        Longitude = float(request.form['Longitude'])
        ATMAX = float(request.form['ATMAX'])
        ATMIN = float(request.form['ATMIN'])
        humidity = float(request.form['humidity'])
        pressure = float(request.form['pressure'])
        tempmax = float(request.form['tempmax'])
        tempmin = float(request.form['tempmin'])
        
        data = np.array([[Latitude, Longitude, ATMAX, ATMIN, humidity, pressure, tempmax, tempmin]])
        my_prediction = crop_recommendation_model.predict(data)
        final_prediction = my_prediction[0]

        return render_template('crop-result.html', prediction=final_prediction, title=title)
    
if __name__ == '__main__':
    app.run(debug=True)    