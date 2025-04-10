import nltk
nltk.download('punk_tab')
paragraph="""Good Morning everyone Iam Pavithra I have Recently completed My Bachelor's of Technology in the branch of CSE."""
sentences = nltk.sent_tokenize(paragraph)
words= nltk.word_tokenize(paragraph)
print(sentences)
print(words)
