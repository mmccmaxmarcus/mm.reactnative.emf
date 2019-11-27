import React, Component from 'react' 
import {Text, FlatList, StyleSheet, View} from 'react-native'
export default class Module extends Component{ 
 
state = { 
module:[
	{moduleContent: 'Introduction to project management',
 concepts: [
	{concept: 'Project management',
concept: 'Project',
concept: 'What is Project Management?',
concept: 'Stakeholders',
concept: 'Sponsor',
concept: 'PMI',
 },], moduleContent: 'References',
 },]
}
render() { 

return( 
	<View >
 		<FlatList data={null} keyExtractor={null} 
renderItem={null}/>
 	</View>
)}
